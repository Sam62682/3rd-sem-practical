class base:
    def demo():
        print("I am demo function.")

class derived(base):
    def demo():
        print("I am overrided demo function.")


print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
d = derived
d.demo()