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

class SuperQueue(Queue):


    def isempty(self):
        return len(self._Queue__queue_lst) == 0
        # Alternative would be to remove the __ from the Parent attribute

que = SuperQueue()
que.put(1)
que.put("dog")
que.put(False)

for i in range(4):
    if not que.isempty():
        print(que.get())
    else:
        print("Queue empty")

