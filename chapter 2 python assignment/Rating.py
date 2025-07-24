while True:
    try:
        rating = int(input('Enter an integer rating between 1 and 10: '))
        if 1 <= rating <= 10:
            break 
        else:
            print("Error: Please enter a number between 1 and 10.")
    except ValueError:
        print("Error: Please enter a valid integer.")


digits = []
number = rating
while number > 0:
    digits.append(number % 10)  
    number //= 10              
digits.reverse()               
print("Rating:", rating)
print("Digits:", digits)