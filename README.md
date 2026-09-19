<div align="center">

# 🌿 Moss

A tiny Java CLI that gives you one small thing to notice.

<p>

<img src="https://img.shields.io/badge/Java%2021-35374B?style=for-the-badge&logo=openjdk&logoColor=white">

<img src="https://img.shields.io/badge/javalabs.io-344955?style=for-the-badge">

</p>

</div>

## What is Moss?

Moss gives you one tiny observation prompt.

Run Moss, and it randomly gives you something small to notice around you.

Look at something.

Listen to something.

Notice something.

Move a little.

That's it.

No scoring. No tracking. No timer.

## Example

```text
$ java -cp target/classes io.javalabs.Main

🌿 Look away.

Find something green.
Notice its shape, texture, and color.
```

Run it again:

```text
$ java -cp target/classes io.javalabs.Main

🌿 Find a pattern.

Look for a repeating pattern nearby,
like fabric weave or wood grain.
```

And maybe:

```text
$ java -cp target/classes io.javalabs.Main

🌿 Listen.

What is the quietest sound you can hear?
Stay with it for 20 seconds.
```

You notice it.

Then you continue your day.

## How It Works

1. Run Moss.
2. Moss randomly selects a prompt.
3. Read it.
4. Do the tiny thing.
5. That's the whole thing. 🌱

## Tech Stack

* Java 21
* `Random`
* Java `List`
* CLI

## Run

Compile:

```bash
mvn clean compile
```

Run:

```bash
java -cp target/classes io.javalabs.Main
```

Run it again whenever you want another prompt.

## Why I Built This

Sometimes a program can just give you a tiny reason to look away from your screen and notice something around you.

Moss is just that.

**Run it.**

**Notice something.**

**Continue your day.** 🌿

## JavaLabs.io

Part of JavaLabs.io - a collection of small Java experiments built to turn random ideas into working code.
