WinWait("[Class:#32770]","",10)

 ControlFocus("File Upload","","Edit1")
 Sleep(2000)
 ControlSetText("File Upload", "", "Edit1","E:\classb\ramselclasses\vinay\workspace10am\FirstProject\ram.txt")
 Sleep(2000)
 ControlClick("File Upload", "","Button1")
