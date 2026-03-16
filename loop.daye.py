#display the sum of all numbers btw 1-10

total = 0
result = 0
first_number = int(input("Enter numbers : "))
for number in range(1,11):
    total += number
    result += total
        print (total)
