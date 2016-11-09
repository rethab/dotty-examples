# Dotty Examples

Meant to demonstrate all the implemented features listed in https://github.com/lampepfl/dotty

Use the instructions in https://github.com/smarter/dotty-example-project to build dotty

More examples may be found in https://d-d.me/talks/scalaworld2015/#/

Some internals and background info: http://felixmulder.com/talks/deconstructing-dotty/#/

## Examples
- [Union](UnionTypes.scala), [Intersection](IntersectionTypes.scala) and Literal singleton types [Blog Post by Sergio De Simone](https://www.infoq.com/news/2015/10/dotty-scala-bootstraps)
- [Trait Parameters](TraitParameters.scala) [SIP](http://docs.scala-lang.org/sips/pending/trait-parameters.html)
- [@Static Methods and Fields](StaticMethods.scala) [SIP](https://github.com/DarkDimius/scala.github.com/blob/664bc155d57af49ec4eb5eb7a7fbb078042d77f5/sips/pending/_posts/2016-01-11-static-members.md)
- Non-blocking lazy vals
- [Multiverseal Equality](MultiversalEquality.scala) [Proposal](https://github.com/lampepfl/dotty/issues/1247)
- Option-less pattern matching(based on name-based patmat)
- Function arity adaptation
- Exhaustivity checks in pattern matching
