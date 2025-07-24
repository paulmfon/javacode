number1 = int(input ("Enter first integer: "))
number2 = int(input ("Enter second integer: "))
number3 = int(input ("Enter third integer: "))

numbers = [number1, number2, number3]

sum_result = reduce(operator.add, numbers)
average = sum_result / len(numbers)
pruduct =   reduce(operator.mul, numbers)
smallest = min(numbers)              
largest = max(numbers)                   


print(f"\nNumbers: {numbers}")
print(f"Sum: {sum_result}")
print(f"Average: {average}")
print(f"Product: {product}")
print(f"Smallest: {smallest}")
print(f"Largest: {largest}")