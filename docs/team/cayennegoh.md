# Cayenne's Project Portfolio Page
## Project : Bookmarked

## Overview
BookMarked is a desktop application designed specifically for librarians to streamline
the management of library inventory and borrower records. It runs in Command Line Interface (CLI), 
and thus it is targeted for fast input. BookMarked is able to manage the library's inventory
through the supported command features available.

## Summary of Contributions
### Code contributed
[RepoSense link](https://nus-cs2113-ay2324s2.github.io/tp-dashboard/?search=cayennegoh&breakdown=true&sort=groupTitle%20dsc&sortWithin=title&since=2024-02-23&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other)

### Enhancement implemented
New feature:
- Added the ability to add a new class, users to the library system
- What it does: Adds borrowers who borrowed books from the library to the system
- Justification: This feature is important to our user, librarians, as they would need to keep track
of who has borrowed or has overdue books, on top of the books in inventory
New feature:
- Added the ability to list users along with their borrowed books
- What it does: Through the borrow command, users are added to a user list and their respective borrowed
books are kept tracked under each users book list. When listing by user, a list of all users, followed by
their currently borrowed books are shown
- Justification: This feature is important to librarians as they would need to keep track of the due
dates of each user and possibly the number of books they borrow to keep it under the cap
New feature:
- Added the ability to find a user
- What it does: Through the find /by user command librarians can find a particular user and his list of books
- Justification: This feature is important when librarians want information on a particular user

Junit tests:
- Contributed to junit tests for Parser, Book, ListCommand
- Created junit tests for ListUserCommand, FindUserCommand, AddCommand

### Contributions to the UG
- Updated UG after changing borrow command parameter
- Updated UG for find command
- Helped to update UG for list command after changing listuser command from an independent command
to be called under list command

### Contributions to the DG
Added diagrams for :
- AddCommand sequence diagram
- ExitCommand sequence diagram
- UiComponent class diagram
- ParserComponent class diagram

Added explanation for :
- AddCommand
- HelpCommand
- ListCommand to include ListUserCommand
- ExitCommand
- Ui Component
- Parser Component

### Contributions to team-based tasks
- Factored out duplicate code in list and find command and placed it under Ui
- Update user profile, value proposition for DG
- Added exception classes such as EmptyUserList


### Review/mentoring contributions
[Link to PRs reviewed by me](https://github.com/AY2324S2-CS2113-W13-4/tp/pulls?q=is%3Apr+reviewed-by%3A%40me+is%3Aclosed)