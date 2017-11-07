#!/usr/bin/env python

#!/usr/bin/env python

import glob, os #imports for accessing the working directory
import PyPDF2, re # import for accessing PyPDF2 module, that helps playing around with PDF's

       
def fnPDF_FindText(xFile, xString):
    # xfile : the PDF file in which to look
    # xString : the string to look for
    PageFound = -1
    aList = []
    pdfDoc = PyPDF2.PdfFileReader(xFile, "rb")
    print('Total number of Pages of this pdf are:')
    print(pdfDoc.getNumPages())
    for i in range(0, pdfDoc.getNumPages()):
        content = ""
        content += pdfDoc.getPage(i).extractText() + "\n"
        # Encoded text : content1 = content.encode('utf-8', 'ignore').lower()
        #print(content);
        ResSearch = re.search(xString, content, flags=0)
        if ResSearch is not None:
           PageFound = i+1
           
           #if PageFound > 0:#PageFound -= 23  
           aList.append(PageFound)
           #break
    print('String found in Page Numbers:')
    #print(PageFound)
    print(aList)
    '\n'
    return PageFound

#First call would be made to below method,
# Change your working directory to one where all PDF's are located
os.chdir("D:/PERSONAL/TECH_TIPS/PYTHON")
    # To print all pdf files from current working directory
for file in glob.glob("*.pdf"):
     print(file)
     fileName = "D:/PERSONAL/TECH_TIPS/PYTHON/" + file  # Here you have to change the value of D:/PERSONAL/TECH_TIPS/PYTHON/
     fnPDF_FindText(fileName, "Stress Data") # Am looking for Stress Data

   
