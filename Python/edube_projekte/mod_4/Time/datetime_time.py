from datetime import datetime

our_object = datetime( 2020, 11, 4, 14, 53)

print(our_object.strftime("%Y/%m/%d %H:%M:%S"))
print(our_object.strftime("%y/%B/%d %H:%M:%S %p"))
print(our_object.strftime("%a, %Y %b %d"))
print(our_object.strftime("%A, %Y %B %d"))
print(our_object.strftime("Weekday: %w"))
print(our_object.strftime("Day of the year: %j"))
print(our_object.strftime("Week number of the year: %W"))




