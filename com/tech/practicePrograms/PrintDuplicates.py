// Python code to print duplicates

>>> words = 'the fox jumped over the lazy dog and over the bear'.split()
>>> seen = set()
>>> dups = set()
>>> for word in words:
        if word in seen:
            if word not in dups:
                print(word)
                dups.add(word)
        else:
            seen.add(word)
            
// Output: 
the
over