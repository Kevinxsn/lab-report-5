# Create your grading script here
set -e
CPATH=".:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar"
rm -rf student-submission
git clone $1 student-submission
cp TestListExamples.java student-submission
cp lib/hamcrest-core-1.3.jar student-submission
cp lib/junit-4.13.2.jar student-submission
echo "trying to configure your submission....."


if [[ -f "./student-submission/ListExamples.java" ]]
then
    echo "At least we found your code"
else
    echo "Even don't find the correct file"
fi

cp -r lib ./student-submission/

cp TestListExamples.java ./student-submission/

set +e


cd student-submission

javac -cp $CPATH *.java

java -cp $CPATH org.junit.runner.JUnitCore TestListExamples 1> stdout

CHECK=$(grep -o "Failures" stdout)
PASS=$(grep -E -o ".{0,2}test.{0,0}" stdout)
FAILURE=$(grep -E -o "Failures.{0,3}" stdout)

# check how many passed tests
if [[ $CHECK ]]
    then
        echo "There are totally 3 tests, one or more tests has been failed, figure it out"
        grep "Number of test you failed:" stdout
    else
        echo "There are totally 3 tests"
        echo "Number of tests you pass: $PASS, good job!"
fi
