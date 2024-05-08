import random
correct_random_answer = 0 
random1 = random.random()
random2 = random.random()


for number in range(10):
	question = int(input(f"what is {random1}+ {random2}"))
random3 = random1 + random2
if question == random3:
	correct_random_answer = correct_random_answer + 1




print("you got" + correct_random_answer)



 