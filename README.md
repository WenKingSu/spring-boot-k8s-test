## 開發版本
| 項目     |             版本 |
|:-------|---------------:|
| Java   | OpenJDK 16.0.2 |
| Gradle |          7.4.2 |


## 打包Jar與Docker Image
### Build Package
```bash
$./gradlew build -x test
```

### Build docker image
```bash
$ docker build -t [harbor server]/library/k8s-test:1.0.0 .
```

### Push docker image to Harbor
```bash
$ docker push [harbor server]/library/k8s-test:1.0.0
```
