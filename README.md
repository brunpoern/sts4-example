# sts4-example
Demo project for Eclipse STS4

## Build project from root dir

```
cd sts4-example-root
./gradlew assemble
```

## Build project from module dir

```
cd sts4-example-app1
../sts4-example-root/gradlew -c ../sts4-example-root/settings.gradle assemble
```
