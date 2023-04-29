@echo off
setlocal EnableDelayedExpansion

set name1=java.exe

for /f "tokens=1" %%a in ('tasklist ^| find /i ".exe"') do (
  if "%%a" == "%name1%" (
    echo Found process: %%a
	taskkill /im %%a /f
  )
)

endlocal