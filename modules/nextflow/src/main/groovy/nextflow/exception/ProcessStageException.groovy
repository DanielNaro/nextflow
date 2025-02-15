/*
 * Copyright 2013-2024, Seqera Labs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nextflow.exception

import groovy.transform.InheritConstructors

/**
 * Exception thrown when an error is raised during the process file staging phase
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 * 
 * Note: This exception extends ProcessUrecoverableException to force the execution to fail instead of
 * retrying the task execution because the file staging process has its own retry strategy, and
 * therefore it's likely to be a permanent error.
 *
 * See also https://github.com/nextflow-io/nextflow/issues/5727
 */
@InheritConstructors
class ProcessStageException extends ProcessUnrecoverableException implements ShowOnlyExceptionMessage {
}
