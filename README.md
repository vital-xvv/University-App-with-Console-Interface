# University App with Console Interface

## The project uses Spring Shell to create console based interface.

The project supports the following console commands:

- `Who is head of department --depName` — Get a full name of a head of the department
- `Show the average salary for the department --depName` — Get the average salary in the specified department
- `Show count of employee for --depName` — Get the count of lectors in the specified department
- `Global search by --template` — Get full names of lectors whose names contain a particular subsequence
- `Show statistics --depName` — Shows the statistics about a department with a particular name

## <p style="text-align: center; color: #3F99EE">ER-diagram for application entities</p>

<p align="center">
  <img alt="ER-diagram" src="./src/main/resources/static/diagrams/university-console-app-ER-diagram.png" width="700"/>
</p>


## Examples of command execution

- `Who is head of department Mathematical`
<p align="center">
  <img alt="ER-diagram" src="src/main/resources/static/assets/example1.png" width="400"/>
</p>

- `Show the average salary for the department Philological`
<p align="center">
  <img alt="ER-diagram" src="src/main/resources/static/assets/example2.png" width="500"/>
</p>

- `Global search by u`
<p align="center">
  <img alt="ER-diagram" src="src/main/resources/static/assets/example3.png" width="300"/>
</p>