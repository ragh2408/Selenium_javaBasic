WinWait("[Class:#32770]","",10)

 ControlFocus("Open","","Edit1")
 Sleep(2000)
 ControlSetText("Open","","Edit1",$CmdLine[1])
 Sleep(2000)
 ControlClick("Open","","Button1")
