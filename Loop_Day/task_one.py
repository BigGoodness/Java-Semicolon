
total = 0
sum_odd = 0
sum_even = 0
square_odd = 0
square_even = 0
mean = 0
sum_square_even = 0
sum_square_odd = 0
sum_square = 0
   
for number in range(10):
    value = int(input('Enter a number: '))
  

    if value % 2 == 0:
        sum_even += value
        square_even *= value
        print("It is an even number") 
    else :
        sum_odd += value
        square_odd *= value
        print(" It is an odd number")
    total = sum_even + sum_odd
    mean = total / 10
    sum_square_odd += square_odd
    sum_square_even += square_even
print(f'sum of even number is {sum_even}')
print(f'sum of odd number is {sum_odd}')
