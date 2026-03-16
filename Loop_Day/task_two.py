square_digit = 1
sum_square_digit = 1
count = 0
mean = 0
total = 0
sum_factorial = 0

factorial = 1
number = input("Enter a number: ")
for value in number:
    
    
    for digit in value:
        digit = int(digit)
        square_digit = digit * digit
        sum_square_digit += square_digit
        
        
        count += 1
        total += digit
        mean =  (total / count)
        for num in range(1, digit+1 ):
            factorial *= num
            sum_factorial += factorial
  
           
        
   # print(square_digit, end= ' ')
   
print(f'The total is {total}')
print(f'The mean is {mean}')

print(f'The sum of the square is {sum_square_digit}')
print(f'the sum of the factorial of  is {sum_factorial}')

