def read_int(prompt, min, max):
    try:
        prompt = int(prompt)
        assert prompt >= min and prompt <= max
    except AssertionError:
        print(f"Error: the value is not within permitted range ({min}..{max})")
    except:
        print("Error: wrong input")
    return prompt


v = read_int(input("Enter a number from -10 to 10: "), -10, 10)

print("The number is:", v)