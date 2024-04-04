# Decorator function
def my_decorator(func):
    # Wrapper function
    def wrapper():
        print("Something is happening before the function is called.")
        func()  # Call the original function
        print("Something is happening after the function is called.")
    return wrapper

# Applying decorator
@my_decorator
def say_hello():
    print("Hello!")

# Calling the decorated function
say_hello()

'''
my_decorator is the decorator function.
wrapper is the wrapper function defined inside my_decorator.
@my_decorator is used to apply the decorator to the say_hello function.
When say_hello() is called, it actually invokes wrapper, which in turn invokes the original say_hello function along with the additional behavior defined in wrapper.
Decorators are commonly used for logging, timing, authorization, caching, and other cross-cutting concerns in Python programming. They provide a clean and concise way to extend the functionality of functions and methods without modifying their core logic.
'''
