def calculate_average(numbers):
    total_number = sum(numbers)
    avg = total_number/len(numbers)
    return avg

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    
    numbers = [10, 20, 30, 40, 50]
    average = calculate_average(numbers)
    print("The average is:", average)