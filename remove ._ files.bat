@echo off
echo Delete all ._ files from folders and sub-folders (Usually produced by macOS)
echo.
echo Author: https://dannyda.com
echo.
echo.
echo.
echo Showing all ._ files that will be deleted
echo.
dir /a /b /s ._*
echo.
echo.
echo ---This script will exit when done---
echo.
setlocal
SET /P confirm=Confirm to delete those files (Y/[N])?
IF /I "%confirm%" NEQ "Y" GOTO END
del /f /q /a /s ._*
:END
endlocal
exit