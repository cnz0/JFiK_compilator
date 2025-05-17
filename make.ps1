#Write-Host "Tworze pakiety gen..."
java -jar tools/antlr-4.13.2-complete.jar -Dlanguage=Java -no-listener -visitor -package gen -o gen grammar/meincraft.g4

#Write-Host "Uruchamiam javac..."
javac -cp ".;tools/antlr-4.13.2-complete.jar" -d bin gen/*.java src/*.java

#Write-Host "Buduje projekt..."
java -cp "bin;tools/antlr-4.13.2-complete.jar" src.Main

#Write-Host "Kompiluję plik .exe"
clang output.ll -o meincraft.exe -fuse-ld=lld -llegacy_stdio_definitions