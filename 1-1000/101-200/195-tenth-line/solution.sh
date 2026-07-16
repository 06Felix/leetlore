count=1
while IFS= read -r line
do
    if (( count == 10 ))
    then
        echo $line
        break;
    else
        (( count++ ))
    fi
done < file.txt
