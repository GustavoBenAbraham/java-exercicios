@echo off
chcp 65001 >nul
echo ========================================
echo      ENVIANDO EXERCICIO PARA GITHUB
echo ========================================

:: Vai para a pasta do repositorio
cd /d "C:\Users\helle\OneDrive\Área de Trabalho\curso-java-basico\CursoJavaBasico"

echo.
set /p MSG="Descreva o que voce adicionou: "

echo.
echo [1/4] Adicionando arquivos novos...
git add .

echo.
echo [2/4] Fazendo commit...
git commit -m "%MSG%"

echo.
echo [3/4] Sincronizando com GitHub...
git pull origin main

echo.
echo [4/4] Enviando para o GitHub...
git push origin main

echo.
echo ========================================
if %ERRORLEVEL% == 0 (
    echo    ENVIADO COM SUCESSO! 
) else (
    echo    ALGO DEU ERRADO!
    echo    Manda print do erro pro Claude :)
)
echo ========================================
echo.
pause