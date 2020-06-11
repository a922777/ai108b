import random 
'''
有 5 位同學，到合作社買飲料，冰箱中共有 7 種飲料，
請問這 5 位同學購買飲料的情形有幾種？

[解法]：每位同學買飲料的方式有 7 種，5 個同學購買飲料有7^5種

'''
##內容都自己想的，程式碼部分參考老師的範例

peoples = ['同學', '學生','小朋友','路人']
stores = ['全家', '7-11','合作社','萊爾富','超商']
x=random.randint(2, 9)
y=random.randint(2, 9)
person=random.choice(peoples)
def math():
    return "有 "+ P()+"，"+S()+"冰箱中共有 "+str(x)+" 種飲料，"+Question()

def P():
    return str(y)+" 位"+person

def S():
    return "到"+random.choice(stores)+"買飲料，"

def Question():
    return "\n請問這 "+P()+"購買飲料的情形有幾種?"
def solution():
    return  "\n解法:"+"每位"+person+"買飲料的方式有 "+str(x)+" 種，"+P()+"購買飲料有"+str(x)+"^"+str(y)+"種"

print(math())
print(solution())
print("\n答案:"+str(pow(x,y))+"種")
