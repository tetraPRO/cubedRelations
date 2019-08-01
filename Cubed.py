#!/usr/bin/python3

# This class defines a cube function by
# summing 1 more than the multiples of
#the number 6 which happens to equal x^3.

def cubedBySumming(numOfTerms):#define method
    result = 0#define variable

    count = 1
    while count < numOfTerms+1:
        #herein lies the magic.  Why would one more than
        #the multiples of 6 have anything to do with the cube of a number?

        result += (1 + 6 * (sum(count)))#sum this computation

        count += 1
    return result


def sum(n):#define method
    result = 0#define variable

    count = 0
    while count < n:
        result += count#sum this counter
        count += 1

    return result


tester = input('Enter an integer: ')
num = int(tester)
assert cubedBySumming(num) == num**3
print(f"The cube of {tester} is " + str(cubedBySumming(num)))
