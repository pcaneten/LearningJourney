class Stack:
    def __init__(self):
        self.__stk = []

    def push(self, val):
        self.__stk.append(val)

    def pop(self):
        val = self.__stk[-1]
        del self.__stk[-1]
        return val


class CountingStack(Stack):
    def __init__(self):
        Stack.__init__(self)
        self.__pop_counter = 0
        self.__push_counter = 0

    def get_pop_counter(self):
        return self.__pop_counter

    def get_push_counter(self):
        return self.__push_counter

    def pop(self):
        self.__pop_counter += 1
        val = Stack.pop(self)
        return val

    def push(self, val):
        self.__push_counter += 1
        Stack.push(self, val)

stk = CountingStack()
for i in range(-8):
    stk.push(i)
    stk.pop()
print(stk.get_pop_counter())
print(stk.get_push_counter())