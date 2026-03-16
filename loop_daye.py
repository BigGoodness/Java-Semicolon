#display the sum of all numbers btw 1-10

total = 0

for number in range(1,11):
    first_number = int(input("Enter numbers: "))
    total += number
print(total, "is the sum of all numbers between 1-10")
