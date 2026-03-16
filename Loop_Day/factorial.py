number = int(input('Enter a number: '))
count = 1
for num in range(1, number+1):
    count *= num
    print(count)
