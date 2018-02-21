// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.github.chajath.guice.aqueduct;


/**
 * A standard implementation of {@link Chained} that sets the member field {@link #next} when {@link
 * #setNext} is called.
 */
public abstract class AbstractPipeline<T extends Chained<T>> implements Chained<T> {
  T next;

  @Override
  public void setNext(T next) {
    this.next = next;
  }
}
