import unittest


# unit test code if it rises and exception

# example 1 ( it we give different number as a input)

def throw_ex(var):
    if var == 100:
        raise Exception("not valid")
    else:
        return True


class MyTestCase(unittest.TestCase):

   def test_sample(self):
       self.assertEqual(throw_ex(10), True)


# example 2

def throw_ex(var):
    if var == 100:
        raise Exception("not valid number")
    else:
        return True


class MyTestCase(unittest.TestCase):

   def test_sample(self):
       self.assertEqual(throw_ex(100), True)

# example 3

def throw_ex(var):
    if var == 100:
        raise Exception("not valid number")
    else:
        return True


class MyTestCase(unittest.TestCase):

   def test_sample(self):
       self.assertRaises(Exception,throw_ex,100)


# example 4

def throw_ex(var):
    if var == 100:
        raise Exception("not valid number")
    else:
        return True


class MyTestCase(unittest.TestCase):

   def test_sample(self):
       self.assertRaises(Exception,throw_ex,10)

# example 5

class MyExcept(Exception):
    pass

def throw_ex(var):
    if var == 100:
        v1 = 12/0 # creating an error
        raise MyExcept("not valid number")
    else:
        return True


class MyTestCase(unittest.TestCase):

   def test_sample(self):
       self.assertRaises(MyExcept,throw_ex,100)


# example 5

class MyExcept(Exception):
    pass
class SecondException(Exception):
    pass


def throw_ex(var):
    if var == 100:
        raise MyExcept("not valid number")
    elif var == 200:
        raise SecondException("Not a valid number")
    else:
        return True


class MyTestCase(unittest.TestCase):

   def test_sample(self):
       self.assertRaises((MyExcept,SecondException),throw_ex,200)



if __name__ == '__main__':
        unittest.main()



