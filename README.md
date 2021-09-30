# JitPack
JitPack test.

### 最新版本：[![](https://jitpack.io/v/zhangzhichaolove/JitPack.svg)](https://jitpack.io/#zhangzhichaolove/JitPack)

## gradle使用方式：

> Step 1. Add it in your root build.gradle at the end of repositories:

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

> Step 2. Add the dependency

```
	dependencies {
	        implementation 'com.github.zhangzhichaolove:JitPack:1.0.8'
	}
```

## maven使用方式：

> Step 1. Add the JitPack repository to your build file

```
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

> Step 2. Add the dependency

```
	<dependency>
	    <groupId>com.github.zhangzhichaolove</groupId>
	    <artifactId>JitPack</artifactId>
	    <version>Tag</version>
	</dependency>
```

## sbt使用方式：

> Step 1. Add it in your build.sbt at the end of resolvers:

```
resolvers += "jitpack" at "https://jitpack.io"
```

> Step 2. Add the dependency

```
libraryDependencies += "com.github.zhangzhichaolove" % "JitPack" % "Tag"
```

## leiningen使用方式：

> Step 1. Add it in your project.clj at the end of repositories:

```
:repositories [["jitpack" "https://jitpack.io"]]
```

> Step 2. Add the dependency

```
:dependencies [[com.github.zhangzhichaolove/JitPack "Tag"]]
```
