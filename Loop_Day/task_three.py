number =  int(input('Enter a positive number: '))
count = 0
while number != 1:
    count += 1
    if number % 2 == 0:
        number  = number / 2
        print(number)
    else:
        number = (number // 3) + 1
       
        print(number)
print(f'The number of steps it took to get to 1 is {count}')
