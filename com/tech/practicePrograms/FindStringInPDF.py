#!/usr/bin/env python

def fnPDF_FindText(xFile, xString):
    # xfile : the PDF file in which to look
    # xString : the string to look for
    import PyPDF2, re
    PageFound = -1
    aList = []
    pdfDoc = PyPDF2.PdfFileReader(xFile, "rb")
    print('Total number of Pages are:')
    print(pdfDoc.getNumPages())
    for i in range(0, pdfDoc.getNumPages()):
        content = ""
        content += pdfDoc.getPage(i).extractText() + "\n"
        # Encoded text : content1 = content.encode('utf-8', 'ignore').lower()
        #print(content);
        ResSearch = re.search(xString, content, flags=0)
        if ResSearch is not None:
           PageFound = i
           PageFound -= 23
           #if(PageFound > 0)
           aList.append(PageFound)
           #break
    print('String found in Page Number:')
    #print(PageFound)
    print(aList)
    return PageFound

fnPDF_FindText('/Users/vishalvedula1/Desktop/automate-the-boring-stuff-with-python-2015-.pdf', 'European')
    


    
