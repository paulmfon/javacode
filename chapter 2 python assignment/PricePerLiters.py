def calculate_fuel_liters(amount_spent, price_per_liter):
    return amount_spent / price_per_liter


try:
    amount_spent = float(input("Enter the amount spent (in your currency): "))
    price_per_liter = float(input("Enter the price per liter of fuel: "))
    
    
    liters = calculate_fuel_liters(amount_spent, price_per_liter)
    
    print(f"For {amount_spent:.2f} spent at {price_per_liter:.2f} per liter, you purchased {liters:.2f} liters of fuel.")
    
except ValueError:
    print("Please enter valid numerical values.")
except ZeroDivisionError:
    print("Price per liter cannot be zero.")
