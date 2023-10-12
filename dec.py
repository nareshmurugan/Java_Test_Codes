a=1
b=int(input("HAI"))
for i in range(b,0,-1):
    for j in range(a):
        print(i,end="")
    print(",",end="")
    a+=1