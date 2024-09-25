## korwin-java

A reimplementation of [bopke's](https://github.com/bopke) [korwin](https://github.com/bopke/korwin) library written in Java.

## Installation

<details>

<summary>Gradle</summary>

```
repositories {
    maven {
        url = "https://maven.pkg.github.com/khenziii/korwin-java"
        credentials {
            username = System.getenv("GITHUB_USERNAME")
            password = System.getenv("GITHUB_TOKEN")
        }
    }
}

dependencies {
    implementation "dev.khenzii:korwin-java:0.0.3"
}
```

</details>

<details>

<summary>Maven</summary>

```
<repositories>
    <repository>
        <id>github-khenzii</id>
        <url>https://maven.pkg.github.com/khenziii/korwin-java</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>dev.khenzii</groupId>
        <artifactId>korwin-java</artifactId>
        <version>0.0.3</version>
    </dependency>
</dependencies>
```

your `~/.m2/settings.xml` should contain the credentials:

```
<settings>
    <servers>
        <server>
            <id>github-khenzii</id>
            <username>${env.GITHUB_USERNAME}</username>
            <password>${env.GITHUB_TOKEN}</password>
        </server>
    </servers>
</settings>
```

</details>

As you may have noticed, you need to authenticate with a PAT (Personal Access Token) in order to fetch a public maven package from GitHub Packages. 

This requirement exist, because of GitHub's security policies.

To generate a PAT with necessary permissions, follow these steps:

1. Go to [github.com/settings/tokens](https://github.com/settings/tokens)
3. Click "Generate new token" 
3. Select the "classic" token type 
4. Grant permission `read:packages`

## Usage

```java
package com.example;

import dev.khenzii.Korwin;

public class Example {
    public static void main(String[] args) {
        System.out.println(Korwin.generateStatement());
    }
}
```

