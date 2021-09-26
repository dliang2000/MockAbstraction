CSVFile="methods2test_all_repos.csv"

while read -r repo; do
      # echo "$repo"
      git clone --depth 1 "$repo" temp-testcount-repo
      cd temp-testcount-repo
      echo "$repo" >> "../output.txt"
      grep -rnw . -e '@Test' | wc -l >> "../output.txt"
      cd ..
      rm -rf temp-testcount-repo
done < "$CSVFile"
