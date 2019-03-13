#lucky number
def luckyNumber(n):
    if luckyNumber.counter > n:
        return 1
    if n % luckyNumber.counter == 0:
        return 0

    # Calculate next position of input number
    n = n - n / luckyNumber.counter
    luckyNumber.counter = luckyNumber.counter + 1

    return luckyNumber(n)

#driver code
x = input("Enter a number: ")
try:
    x = int(x)
except ValueError:
    print("Please enter a number")

luckyNumber.counter = 2  # Acts as static variable
if luckyNumber(x):
    print (x, "is Lucky")
else:
    print (x, "is not Lucky")
