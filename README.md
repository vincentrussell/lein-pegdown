This plugin converts markdown templates using [Pegdown](https://github.com/sirthias/pegdown) library. This library is in development and has been tested with Clojure 1.3.0 and Leiningen 2.0.0-preview3.

Installation
============

`lein-pegdown` is available as a plugin.

    $ lein plugin install lein-pegdown 0.1

Or you can include it in your `project.clj`:

    :plugins [[lein-pegdown "0.1"]])


Use
===

To evaluate a pegdown template in file, `template`:

    $ lein pegdown template

Example
=======

Then running

    lein pegdown resources/hello-world.markdown

Will output the html representation of the markdown file

Contributors
============

[Vincent Russell](https://github.com/chentecaliente)
