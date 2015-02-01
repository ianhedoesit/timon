-- name: all-scripts
-- Selects all scripts
SELECT id FROM scripts;

-- name: create-scripts-table-if-not-exists!
-- Create the contacts table if it does not exist
CREATE TABLE IF NOT EXISTS scripts (
  id serial PRIMARY KEY);
