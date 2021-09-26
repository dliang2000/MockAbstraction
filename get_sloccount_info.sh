CSVFile="ReposWithTestCasesCloseToGhafaris.txt"

while read -r repo testcase; do
      # echo "$repo"
      git clone --quiet --depth 1 "$repo" temp-linecount-repo
      echo "$repo"
      sloccount temp-linecount-repo
      rm -rf temp-linecount-repo
done < "$CSVFile"
