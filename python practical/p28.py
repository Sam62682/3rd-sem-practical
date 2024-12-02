def describe_pet(pet_name, pet_type='dog'):
    
    print(f"I have a {pet_type} named {pet_name}.")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")

    describe_pet(pet_name="Buddy", pet_type="dog")  
    describe_pet(pet_type="cat", pet_name="Whiskers") 
    describe_pet(pet_name="Polly")                    