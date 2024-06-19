
# shellcheck disable=SC2045
for item in $(ls $1); do
  git add "$item"
  git commit -m "add ${item%.*} component"
done