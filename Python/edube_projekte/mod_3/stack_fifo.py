class QueueError(IndexError):
    pass


class Queue:
    def __init__(self):
        self.__queue_lst = []


    def put(self, elem):
        self.__queue_lst.append((elem))

    def get(self):
        if len(self.__queue_lst) == 0:
            raise QueueError
        val = self.__queue_lst[0]
        del self.__queue_lst[0]
        return val



que = Queue()
que.put(1)
que.put("dog")
que.put(False)
try:
    for i in range(4):
        print(que.get())
except:
    print("Queue error")
