def CharacterCount(str):
    count = {}

    for i in str:
        count[i] = count.get(i, 0) + 1

    for i in count:
        if count[i] > 1:
            print(i, "->", count[i], "\t")

str = input("Enter the string: ")

CharacterCount(str)