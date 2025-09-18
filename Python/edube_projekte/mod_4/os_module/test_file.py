import os

#os.makedirs("./tree/c/other_courses/cpp")
#os.makedirs("./tree/c/other_courses/python")
#os.makedirs("./tree/cpp/other_courses/c")
#os.makedirs("./tree/cpp/other_courses/python")
#os.makedirs("./tree/python/other_courses/c")
#os.makedirs("./tree/python/other_courses/cpp")
print(os.listdir())
os.chdir("./tree")
print(os.listdir())
os.chdir("/tree/c")
print(os.listdir())