fname = "file1.txt"
def fileCount(f):
    linecount = 0
    wordcount = 0
    charcount = 0
    words = []

    _file = open(fname,'r')

    for line in _file:
        linecount += 1
        word = line.split()
        words += word

    for word in words:
        wordcount += 1
        for char in word:
            charcount += 1
    
    return (linecount,wordcount,charcount)

fname = input("Enter the name of the file to be used:")

linecount,charcount,wordcount = fileCount(fname)
print ("There are",linecount,"lines in the file")
print ("There are",wordcount,"word in the file")
print ("There are",charcount,"char in the file")