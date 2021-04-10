from collections import OrderedDict
def function(lst,word):
    k = 0
    for words in lst:
        if words == word:
            k += 1
    return {word:k}

file = open('resourse_1.txt')
string = file.read()+' '
lst = []
word = ''
for charing in string:
    if ord(charing) == 10 or ord(charing) == 32:
        if charing is not '':
            lst.append(word)
        word = ''
    else:
        word += charing
file.close()
slovar = {}
for word in lst:
    slovar.update(function(lst,word))
sorted_list = OrderedDict(sorted(slovar.items(),key = lambda t: t[0]))
sorted_list2 = OrderedDict(sorted(sorted_list.items(), key= lambda t: -t[1]))
file2 = open('result_1.txt','w')
for key, value in sorted_list2.items():
    file2.write(key + ' ' + str(value) + '\n')


