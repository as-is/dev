@echo off

call :clear .\jchess

rem ----------------------------------------------------------------------------
:clear

pushd %1
if exist .bin (
	del /S /Q .bin > nul
	rd /S /Q .bin
)
popd

exit /b 0
