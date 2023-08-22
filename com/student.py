
def assign_books(books, students, issued_books):
    assignment = [None] * len(students)
    books_taken = set()

    for student_id in range(len(students)):
        for book_id in students[student_id]:
            if book_id not in issued_books and book_id not in books_taken:
                assignment[student_id] = book_id
                books_taken.add(book_id)
                issued_books.add(book_id)
                break

    return assignment

def optimal_student_sequence(booksNum, avail, studentNum, reqBooks, studentBooks, studentIssuedBooks, issuedBooks):
    issued_books = set(tuple(book_list) for book_list in issuedBooks)  # Convert to set of tuples
    assignments = []

    for _ in range(studentNum):
        assignment = assign_books(avail, studentBooks, issued_books.copy())  # Use a copy of issued_books
        if None in assignment:
            return [-1]  # Not all students can complete assignments
        assignments.append(assignment)
    #print(assignment)
    return assignment

# Read input
booksNum = int(input())
avail = list(map(int, input().split()))
studentNum, reqBooks = map(int, input().split())
studentBooks = [list(map(int, input().split())) for _ in range(studentNum)]
studentIssuedBooks, issuedBooks = map(int, input().split())
issuedBooksList = [list(map(int, input().split())) for _ in range(studentIssuedBooks)]

# Get the optimal student sequence
result = optimal_student_sequence(booksNum, avail, studentNum, reqBooks, studentBooks, studentIssuedBooks, issuedBooksList)  # Use issuedBooksList
print(*result)